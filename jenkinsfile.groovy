pipeline{
  agent any
  stages{
    stage("reading a text file"){
      steps{
        script{
          File file = new File("GroovyscriptsPractice/note.txt") 
          println file.text 
        }
      } 
    } 
  } 
}  
