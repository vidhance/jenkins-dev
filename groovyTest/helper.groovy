#!groovy
import jenkins.model.Jenkins

def test1() {
    sh(script: 'echo test1', label: 'test1')
    sh(script: 'echo variable', label: "Branch: ${env.BRANCH}")
}

return this
