pipeline{

	Agent any
	
	stages{
		stage("Pulling code from git"){
			step{
				git( url: 'https://github.com/swamiped/SimpleWeb.git', branch: 'main')
			    }
		stage('Build Docker Image'){
			steps{
				
					docker build -t simpleweb:first .
					docker run -d -p 9091:80  simpleweb:first
			     }
				
					    }
                            }
                                             }
               }
	 }
				