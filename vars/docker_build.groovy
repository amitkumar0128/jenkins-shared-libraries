def call(String DockerHubUser, String ProjectName, String ImageTag, String Path){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ${Path}"
}
