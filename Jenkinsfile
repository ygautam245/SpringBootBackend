pipeline {
        agent any
        environment{
            mvnHome=tool name: 'maven', type: 'maven'
            mvnCmd = "${mvnHome}/bin/mvn"
            
        }
        stages {
            stage('Build') {
                steps {
                    git 'https://github.com/ygautam245/SpringbootApplication.git'
                    bat "${mvnCmd} clean package"
                    
                }
                
            }
            stage("Running"){
                steps {
                    
                    bat "${mvnCmd} org.springframework.boot:spring-boot-maven-plugin:run"
                    
                }
                
            }
            
        }
    
}
