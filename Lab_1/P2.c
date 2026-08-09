#include <stdio.h>
void main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    int temp = n;
    int sum = 0;
    while(temp!=0){
        int rem = temp%10;
        sum += rem;
        temp /= 10;
    }

    printf("Sum: %d", sum);
}