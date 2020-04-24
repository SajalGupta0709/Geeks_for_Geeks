struct node *reverse (struct node *head, int k)
{   int c=0;
    // Complete this method
    struct node* prev=NULL;
    struct node* next=NULL;
    struct node* current=head;
    while(current!=NULL && c<k){
        next= current->next;
        current->next=prev;
        prev=current;
        current=next;
		c++;
    }
    if (next != NULL)  
    head->next = reverse(next, k);

    return prev;
}
