#include <stdio.h>

void main() {
	int num;
	unsigned int abs_value;

	scanf_s("%d", &num);
	if (num > 0) {
		abs_value = num;
		printf("abs_value = %d", abs_value);
	}
	else if(num < 0) {
		abs_value = -num;
		printf("abs_value = %d", abs_value);
	}
}