#include <stdio.h>

int main(void) {
	int t,i,n,rem,first,last;
	scanf("%d",&t);
	for(int i=0;i<t;i++) {
	    scanf("%d",&n);
	    while(n!=0){
	        rem=n%10;
	        if(i=0)
	            first=rem;
	        n=n/10;
	        if(n==0)
	            last=rem;
	            
	    }
	    printf("%d \n",first+last);
	}
	return 0;
}