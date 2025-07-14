def call(String imageName, String tagName, String path){
  sh 'docker build -t "${imageName}":"${tagName}" "${path}"'
}
