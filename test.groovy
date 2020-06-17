pipeline {
    stages{
        stage("test") {
	    echo "Hi"
	}
    post {
        always {
	    emailext attachLog: false,
	    to: '$DEVOPS_TEAM_MAIL_LIST'
        }
    }
}
