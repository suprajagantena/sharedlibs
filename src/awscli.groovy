class awscli {

    def context

    def awscli(def context){
        this.context = context
    }

    def runCmd(cmd){
        return context.sh(cmd)
    }

    def creates3bucket(String bucketname){
        String cmd = "aws create-bucket --bucket $bucketname"
        return runCmd(cmd)
    }
}