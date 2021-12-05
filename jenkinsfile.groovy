pipeline{
  agent any
  stages{
    stage("reading a text file"){
      steps{
        script{
          sh 'pwd'
          File file = new File("/note.txt") 
          println file.text 
        }
      } 
    } 
  } 
}  
