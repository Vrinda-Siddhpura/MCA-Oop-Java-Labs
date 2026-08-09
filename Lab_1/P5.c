#include <stdio.h>
void main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    int res = 1;
    for(int i=1 ; i<=n ; i++){
        res *= i;
    }

    printf("Factorial: %d", res);
}