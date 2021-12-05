pipeline{
  agent any
  stages{
    stage("reading a text file"){
      steps{
        script{
          sh 'pwd'
          File file = new File("/var/lib/jenkins/workspace/Jenkins-Groovy-pratice-2/note.txt") 
          println file.text 
        }
      } 
    } 
  } 
}  
