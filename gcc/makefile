
all: byZero.o leak.o positiveArray.o  nullPointer.o
byZero.o: divideByZero.c
	gcc -o divide divideByZero.c -fsanitize=float-divide-by-zero

leak.o: leak.c
	gcc -o leak leak.c -fsanitize=leak


positiveArray.o:  positive.c
	gcc -o posi positive.c -fsanitize=vla-bound


nullPointer.o: software_security_c.c
	gcc -o nullPointer software_security_c.c -fsanitize=null

.PHONY: clean all

clean:
	rm *.o
