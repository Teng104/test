pipeline {
    stages{
        stage("test") {
	    echo "Hi"
	}
    post {
        always {
	    emailext attachLog: false,
	    to: 'aaa@bbb.com'
        }
    }
}
