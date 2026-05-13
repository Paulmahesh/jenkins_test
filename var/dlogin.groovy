def call(credentialsId){
  withCredentials([
    usernamePassword(
      credentialsId: "dj",
      usernameVariable: "dj_user",
      passwordVariable: "dj_pass"
    )
  ])
}
