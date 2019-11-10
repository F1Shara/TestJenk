node
{
 stage 'stage 1'
 echo 'Hello world 1'

 stage 'stage 2'
 echo 'Hello world 2'

 stage 'stage 3'
 build job: 'hello-task', parameters: [[$class: 'StringParameterValue', name: 'CoolParam', value: 'hello']]
}