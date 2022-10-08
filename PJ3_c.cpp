#include <stdio.h>

void main() {
	int a;
	int b;
	printf("2개의 정수는? >>");
	scanf_s("%d %d", &a, &b);

	printf("두 정수의 합은? %d", a + b);
}