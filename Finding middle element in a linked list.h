int getMiddle(Node *head)
{   struct Node* s=head;
    struct Node *f=head;
    if(head==NULL) return (-1);
    else{
        while(f!=NULL && f->next!=NULL){
            f=f->next->next;
            s=s->next;
        }
        return s->data;
    }
   // Your code here
}
