#include <stdio.h>

void main() {
	int day_of_week;
	int fee;

	scanf_s("%d", &day_of_week);
	if (day_of_week == 1) {
		fee = 5000;
	}
	else if (day_of_week == 0 || day_of_week == 6) {
		fee = 10000;
	}
	else {
		fee = 8000;
	}

	printf("fee = %d", fee);
}