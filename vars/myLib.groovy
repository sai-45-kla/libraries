def call(){
  sh 'mvn cleam'
  sh 'mvn compile'
  sh 'mvn package'
} 
