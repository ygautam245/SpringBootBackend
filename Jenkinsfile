pipeline {
agent any
stages {
stage('Stage 1: Maven clean') {
steps {
bat "mvn clean"
}
}
stage('Stage 2: Maven install') {
steps {
bat "mvn install"
}
}
stage('Stage 3: Compilation') {
steps {
bat 'mvn compile'
}
}
stage('Stage 4: Unit Test') {
steps {
bat 'mvn test'
}
}
stage('Final Stage: Maven Package') {
steps {
bat(script: 'mvn package')
}
}
}
}
