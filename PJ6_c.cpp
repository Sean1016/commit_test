#include <stdio.h>

void main() {
	int month;
	
	printf("달을 입력하세요 >>>");
	scanf_s("%d ", &month);

	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		printf("해당 월은 큰달입니다");
		break;
	case 2:
	case 4:
	case 6:
	case 9:
	case 11:
		printf("해당 월은 작은달입니다");
		break;
	
	}

	/*if (month == 8 || month == 12 || month == 10) {
		printf("%d월은 큰달입니다", month);
	}
	else if (month % 2 == 0 || month > 8) {
		printf("%d월은 작은달입니다", month);
	}
	else if (month < 8 && month % 2 != 0) {
		printf("%d월은 큰달입니다", month);
	}*/
}