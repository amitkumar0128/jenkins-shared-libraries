def call(String DockerHubUser, String ProjectName, String ImageTag){
  withCredentials([usernamePassword(
      credentialsId:"dockerHub",
      passwordVariable:"dockerHubPass",
      usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  }
  sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
}
