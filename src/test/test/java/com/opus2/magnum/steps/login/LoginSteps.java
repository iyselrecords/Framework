package com.opus2.magnum.steps.login;
import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.AfterStory;

import com.opus2.core.Configuration;
import com.opus2.pages.login.LoginPage;
import com.opus2.pages.login.MemorableWordPage;
import com.opus2.pages.logout.SignOut;
import com.opus2.util.User;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
  LoginPage loginPage;
  MemorableWordPage memWordPage;
  
  SignOut signoutPage;
  
  @Step
  public void openLoginPage(){
    loginPage.view();
  }
  @Step
  public void loginAs(){
    loginPage.authenticateSuccessFully();
    loginPage.setImplicitTimeout(5, TimeUnit.SECONDS);
  }
  @Step
  public void authenticateBy(String email , String password){
    loginPage.authenticateBy(email, password);
    memWordPage.view();
  }
  
  //@AfterStory
 	//public void afterStory(){
	  //signoutPage.signOut();
	  //System.out.println("signing out");
 	//}
  
  @Step
  public void fillMemorableWordFormSucessfully(){
    int firstIndex = memWordPage.getMemorableWordIndexAt(0);
    int secondIndex = memWordPage.getMemorableWordIndexAt(1);
    int thirdIndex = memWordPage.getMemorableWordIndexAt(2);
    User user = Configuration.selectedUser;
    memWordPage.fillMemorableWordAt(0, user.getMemorableWordAt(firstIndex));
    memWordPage.fillMemorableWordAt(1, user.getMemorableWordAt(secondIndex));
    memWordPage.fillMemorableWordAt(2, user.getMemorableWordAt(thirdIndex));
    Serenity.takeScreenshot();
    memWordPage.submitForm();
    memWordPage.setImplicitTimeout(3, TimeUnit.SECONDS);
  }
  @Step
  public void fillMemorableWordFormFail(){
    int secondIndex = memWordPage.getMemorableWordIndexAt(1);
    int thirdIndex = memWordPage.getMemorableWordIndexAt(2);
    User user = Configuration.selectedUser;
    //failing deliberately
    memWordPage.fillMemorableWordAt(0, user.getMemorableWordAt(thirdIndex));
    memWordPage.fillMemorableWordAt(1, user.getMemorableWordAt(secondIndex));
    memWordPage.fillMemorableWordAt(2, user.getMemorableWordAt(thirdIndex));
    memWordPage.submitForm();
    memWordPage.setImplicitTimeout(3, TimeUnit.SECONDS);
  }
  public void openMemorableWordPage() {
    if(memWordPage==null){
      
    }
    memWordPage.view();
    Serenity.takeScreenshot();
  }
}
