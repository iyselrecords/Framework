package com.opus2.magnum.steps.login;
import java.util.concurrent.TimeUnit;

import com.opus2.core.configuration.Configuration;
import com.opus2.pages.login.LoginPage;
import com.opus2.pages.login.MemorableWordPage;
import com.opus2.util.User;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
  LoginPage page = new LoginPage();
  MemorableWordPage memWordPage = new MemorableWordPage();
  @Step
  public void openLoginPage(){
    page.view();
  }
  @Step
  public void loginAs(){
    page.authenticateSuccessFully();
    page.setImplicitTimeout(5, TimeUnit.SECONDS);
  }
  @Step
  public void authenticateBy(String email , String password){
    page.authenticateBy(email, password);
  }
  @Step
  public void openMemorableWordPage() {
    memWordPage.view();
  }
  @Step
  public void fillMemorableWordFormSucessfully(){
    int firstIndex = memWordPage.getMemorableWordIndexAt(0);
    int secondIndex = memWordPage.getMemorableWordIndexAt(1);
    int thirdIndex = memWordPage.getMemorableWordIndexAt(2);
    User user = Configuration.selectedUser;
    memWordPage.fillMemorableWordAt(0, user.getMemorableWordAt(firstIndex));
    memWordPage.fillMemorableWordAt(1, user.getMemorableWordAt(secondIndex));
    memWordPage.fillMemorableWordAt(2, user.getMemorableWordAt(thirdIndex));
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
}
