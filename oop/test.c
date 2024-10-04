#include <stdio.h>

int main(){
    
    int count = 0;
    for(int i;i<9000;i++){

        if(i%7==0){
            count += 1;
        }
    }
    printf("%d",count);
}