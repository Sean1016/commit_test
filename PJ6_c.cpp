#include <stdio.h>

void main() {
	int month;
	
	printf("���� �Է��ϼ��� >>>");
	scanf_s("%d ", &month);

	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		printf("�ش� ���� ū���Դϴ�");
		break;
	case 2:
	case 4:
	case 6:
	case 9:
	case 11:
		printf("�ش� ���� �������Դϴ�");
		break;
	
	}

	/*if (month == 8 || month == 12 || month == 10) {
		printf("%d���� ū���Դϴ�", month);
	}
	else if (month % 2 == 0 || month > 8) {
		printf("%d���� �������Դϴ�", month);
	}
	else if (month < 8 && month % 2 != 0) {
		printf("%d���� ū���Դϴ�", month);
	}*/
}