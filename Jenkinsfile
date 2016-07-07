node ('master') {
  checkout scm
  String projectRelease = "${env.JOB_NAME} #${env.BUILD_NUMBER}"
  init()
  executeTests()
  publishResults()
}
def init() {
  stage name: 'Initialise build environment', concurrency: 1

  gitClean()

  env.PROJECT = readFile("PROJECT").trim()
  env.VERSION = "${env.BRANCH_NAME}"
  env.BUILD = "${env.BUILD_NUMBER}".padLeft(6,"0")
}
def executeTests(){
withEnv(["PATH+MAVEN=${tool 'MAVEN'}/bin"]){
	sh "mvn -B -e -q clean verify"
}
def publishResults(){
  publishHTML(target: [
        reportName : 'Serenity',
        reportDir:   'target/site/serenity',
        reportFiles: 'index.html',
        keepAll:     true,
        alwaysLinkToLastBuild: true,
        allowMissing: false
    ])
}
/**
 * Clean a Git project workspace.
 * Uses 'git clean' if there is a repository found.
 * Uses Pipeline 'deleteDir()' function if no .git directory is found.
 */
def gitClean() {
  timeout(time: 60, unit: 'SECONDS') {
    if (fileExists('.git')) {
      echo 'Found Git repository: using Git to clean the tree.'
      // The sequence of reset --hard and clean -fdx first
      // in the root and then using submodule foreach
      // is based on how the Jenkins Git SCM clean before checkout
      // feature works.
      sh 'git reset --hard'
      // Note: -e is necessary to exclude the temp directory
      // .jenkins-XXXXX in the workspace where Pipeline puts the
      // batch file for the 'bat' command.
      sh 'git clean -ffdx'
      sh 'git submodule foreach --recursive git reset --hard'
      sh 'git submodule foreach --recursive git clean -ffdx'
    } else {
      echo 'No Git repository found: using deleteDir() to wipe clean'
      deleteDir()
    }
  }
}
