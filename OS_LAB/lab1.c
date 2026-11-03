#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main(){

    fork();

    printf("hello rahat_beldar!!\n PID = %d\n", getpid());
    exit(18);
    return 0;

}


// @rahatbeldar2 ➜ /workspaces/RAHAT_MSSU_LAB/OS_LAB (main) $ gcc lab1.c
// @rahatbeldar2 ➜ /workspaces/RAHAT_MSSU_LAB/OS_LAB (main) $ ./a.out
// hello rahat_beldar!!
//  PID = 6605
// hello rahat_beldar!!
//  PID = 6606
// @rahatbeldar2 ➜ /workspaces/RAHAT_MSSU_LAB/OS_LAB (main) $ 