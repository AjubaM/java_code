package start;


public class Hwork {
	
	        public static void main(String[] args) {
	   
	        	int temp=0;
	        	int sum=0;
	        	int arr[]={4,3,6,8,9,10,12,15};
	         
	        	for(int i=0;i<3;i++)
	        	{
	        		sum = sum + arr[i];
	        	}
	        	System.out.println("\n*********sum of array from index 0 to 2");
	        	System.out.println(sum);
	        	
	        	System.out.println("\n***************************");
	        	
	        	
	        	
	        	for(int i=3;i<arr.length;i++)
	        	{
	        		    temp = arr[2];
	        		    arr[2] = arr[5];
	        		    arr[5] = temp;  
	        	}
	        	 for(int i=3;i<arr.length;i++)
	 	        {
	 		      System.out.print(arr[i]+ " ");
	 	        }
	        	 
	        	 System.out.println("\n************see 10 & 6 is swaping");;
	        	    int max = arr[0];
	                int secondmax = arr[0];
	                int min = arr[0];
	                int secondmin = arr[0];

	                System.out.println("\n The given array is above declaration:" );
	                for (int i = 0; i < arr.length; i++)
	                {
	                        System.out.print(arr[i]+" ");
	                }
	                System.out.println("\n*****************************");
	                for (int i = 0; i < arr.length; i++)
	                {
	                        if (arr[i] > max)
	                        {
	                                secondmax = max;
	                                max = arr[i];
	                        }
	                        else if (arr[i] > secondmax)
	                        {
	                                secondmax = arr[i];
	                        }
	                }
	                for (int i = 0; i < arr.length; i++)
	                {
	                        if (arr[i] < min)
	                        {
	                                secondmin = min;
	                                min = arr[i];
	                        }
	                        else if (arr[i] < secondmin)
	                        {
	                                secondmin = arr[i];
	                        }
	                }
	                System.out.println("\nSecond maximum number is: " + secondmax);
	                System.out.println("\nSecond minimum number is: " + secondmin);
	                
	           
	                System.out.println("\n**create antother array and insert two value***");
	             
	            	int size;
	        		int temp1;
	        		int arr1[] = {12,4,34,83};
	        		size = arr1.length;
	        		for(int i=0;i<size;i++)
	        		{
	        			for(int j=i+1;j<size;j++)
	        			{
	        				if(arr1[i]<arr1[j])
	        				{
	        					temp1 = arr1[i];
	        					arr1[i] = arr1[j];
	        					arr1[j]=temp1;
	        				}
	        			}
	        		}	
	        		 for(int i=0;i<arr1.length;i++)
	        	        {
	        		      System.out.print(arr1[i]+ " ");
	        	        }
	        		   System.out.println("\n*****decending order value");
	        	}
}
	        
	 /****************************************************************************************************************/       	 
	        	 
	        
//	        	 int n = arr.length;
//	        	 int highest = Integer.MIN_VALUE;
//	    		 int secondHighest = Integer.MIN_VALUE;
//	    		 
//	    		 for(int i=0;i<arr.length;i++)
//	    		 {
//	    			 if(arr[i]>highest)
//	    			 {
//	    				 secondHighest  = highest;
//	    				 highest = arr[i];
//	    			 }
//	    			 if(arr[i] < highest && arr[i] > secondHighest)
//	    			 {
//	    				 secondHighest = arr[i];
//	    			 }
//	    			 
//	    		 }
//	    		 System.out.println("Second highest number " +arr[n-2]);
//	    		 
//	        	 int lowest = Integer.MAX_VALUE;
//	    		 int secondlowest = Integer.MAX_VALUE;
//	    		 
//	    		 for(int i=0;i<arr.length;i++)
//	    		 {
//	    			 if(arr[i]<lowest)
//	    			 {
//	    				 lowest = arr[i];
//	    			 }
//	    			 if(arr[i] < lowest  && arr[i] < secondlowest)
//	    			 {
//	    				 secondlowest = arr[i];
//	    			 }
//	    			 
//	    		 }
//	    		 System.out.println("Second Lowest number " +arr[n-2]);
//	       }
//	}
	        

	 /***************************************SirAssignment**************************************************************/       	 

	                 		
//	                 		int sum=0;
//	                 		int sum1=0;
//	                 		int mul=0;
//	                 		int i=0;
//	                 		int arr[ ] = {1,2,3,4,5,6,7,8,9,10};
//	                 		 for( i=6; i<arr.length;i++)
//	                 		 {
//	                 		 sum = sum+arr[i];
//	                 		 }
//	                 		 for(i=1;i<5;i++)
//	                 		 {
//	                 			 sum1 = sum1+ arr[i];
//	                 		 }
//	                 		 
//	                 		 System.out.println(sum +          " case 1 : find yout the submission of 6 to 10 ");
//	                 		 System.out.println(sum1  +        " case 2: find yout the submission of 1 to 5 ");
//	           
//	                 		 mul = sum * sum1;
//	                 		 System.out.println(mul +             " case 3 : multificaion both submission check the result is even and odd");
//	                 		 if(mul%2==0)
//	                 		 {
//	                 			  System.out.println("Even number");  // Answers Even number
//	                 		  }
//	                 		  else
//	                 		  {
//	                 			  System.out.println("odd number");
//	                 		  }
//	                 		 
//	                 		  int rem,num=mul,rev=0;
//	                 		  int compare = num;
//	                 		  
//	                 		  while(num!=0)
//	                 		  {
//	                 			  rem = num%10;
//	                 			  rev = rev*10+rem;
//	                 			  num = num/10;
//	                 		  }
//	                 		  
//	                 		  if(rev==compare)
//	                 		  {
//	                 			  System.out.println("palindrome" +           "case 4: check that number is palindrome is not ");
//	                 		  }
//	                 		  else
//	                 		  {
//	                 			  System.out.println("not palindrome");
//	                          }
//	                 	
//	                 	    	 int sum3=0;
//	                 	    	 int mul1=0;
//	                 		  	for(i=0;i < arr.length;i++)
//	                 		  	{
//	                 		  		sum3 = sum3 + arr[i];
//	                 		  		mul1 = sum3*20;
//	                 		  	}
//	                 		  		System.out.println(mul1+ "   "+   "case : 5  find out submission from 0 to last postion and multiply with 20");
//	                 		  		
//	                 		  		
//	                 		  		int subnum=0;
//	                 		  		subnum = mul1 - mul;
//	                 		  		System.out.println(subnum+ "    " +"case :5  substract with thrd result" );
//	                 		  		
//	                 		  		int num1 = subnum;
//	                 		  		boolean flag = true;
//	                 		  		for(i=2;i<num1;i++)
//	                 		  		{
//	                 		  			if(num1%2==0)
//	                 		  			{
//	                 		  				flag = false;
//	                 		  				System.out.println("Not a prime number" );// case 5 result is not a prime number...
//	                 		  				break;
//	                 		  			}
//	                 		  			if(flag==true)
//	                 		  			{
//	                 		  				System.out.println("Prime number");
//	                 		  			}
//	                 		  		}
//	                 		  		
//	                 		  	}
//	                 	
//}


	                 	 	
	                 	
	                 		
	               	 



