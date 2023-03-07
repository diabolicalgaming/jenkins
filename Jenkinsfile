// pipeline must be top-level

pipeline {
    /*
        Build can run on any available Jenkins agent.

        * agent - is where to execute, e.g. Node, executor or Node etc.

        * stages - where the "work" happens, you can define each stage and steps.
          There can be as many stages as you want.
    */
    agent any

    stages {
        stage("build") {
            steps {
                echo "building the application"
            }
        }

        stage("test") {
            steps {
                echo "testing the application"
            }
        }

        stage("deploy") {
            steps {
                echo "deploying the application"
            }
        }
    }
}