//
// Created by יאנה on 26/05/2020.
//

#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
void leak(){
    printf("memory leak\n");
    void *p;
    p = malloc(7);
    p = 0;
}
int main() {

    leak();
}