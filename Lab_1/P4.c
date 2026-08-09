#include <stdio.h>
void main(){
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    int countOdd = 0;
    int countEven = 0;

    while(n!=0){
        int rem = n%10;
        if(rem%2==0){
            countEven++;
        }
        else{
            countOdd++;
        }
        n /= 10;
    }

    printf("Odd: %d\n", countOdd);
    printf("Even: %d", countEven);
}