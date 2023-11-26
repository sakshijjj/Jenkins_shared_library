def call() {
    sh 'trivy image sakshijoshi522/youtube:latest > trivyimage.txt'
}
