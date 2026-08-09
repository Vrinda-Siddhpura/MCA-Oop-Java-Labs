#include <stdio.h>
#include <string.h>

void main(){
    char string[] = "darshan";

    int len = strlen(string);

    for(int i=0 ; i<len ; i++){
        for(int k=0 ; k<len-i ; k++){
            printf(" ");
        }

        for(int j=0 ; j<=i ; j++){
            printf("%c ", string[j]);
        }
        printf("\n");
    }
}
