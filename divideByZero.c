//
// Created by יאנה on 26/05/2020.
//

#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
void divideByZero(){
    printf(" dividing by zero \n");
    float num=10;
    num=num/0;

}
int main() {

    divideByZero(11);
}