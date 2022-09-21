#include <stdio.h>

int GCD(int num1, int num2) {

    int num3;
    while (num2 != 0) {
        num3 = num1 % num2;
        num1 = num2;
        num2 = num3;
    }
    return num1;
}

void main() {
    int num1, num2;
    printf("두 수를 입력하시오 >> ");
    scanf_s("%d %d", &num1, &num2);
    int GCD_num = GCD(num1, num2);
    printf("첫 번째 수 = %d, 두 번째 수= %d, 최대공약수 = %d", num1, num2, GCD_num);
}
