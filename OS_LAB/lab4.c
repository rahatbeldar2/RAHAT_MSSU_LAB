#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

void *print_message (void*arg)
{
    char *message = (char*)arg;
    
    for (int i = 0;i<5;i++)
    {
        printf("%s: %d\n ", message,i+1);
    }
    return NULL;
}

int main()
{
    pthread_t thread1,thread2;
    
    pthread_create(&thread1,NULL,print_message,"thread1");
    pthread_create(&thread2,NULL,print_message,"thread2");
    
    pthread_join(thread1,NULL);
    pthread_join(thread2,NULL);
    
    printf("Both threads have finished.\n");
    
    return 0;
}