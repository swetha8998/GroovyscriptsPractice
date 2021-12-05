def file
def doc
pipeline{
  agent any
  stages{
    stage("reading a text file"){
      steps{
        script{
          sh 'pwd'
           file = new File("/var/lib/jenkins/workspace/Jenkins-Groovy-pratice-2/note.txt") 
          doc = file.text 
        }
      } 
    } 
    stage("writing to the text file"){
      steps{
        script{
        //file.withWriter('utf-8') { 
         //writer -> writer.writeLine 'Hello World' 
       file.append("hi")
          println file.text
   //     }  
        }
      }
    }
    stage("replacing a text in a file"){
      steps{
        script{
        //file.withWriter('utf-8') { 
         //writer -> writer.writeLine 'Hello World' 
       doc.replaceAll('love','like')
          println doc
   //     }  
        }
      }
    }
  } 
}  
