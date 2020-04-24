if (k == 0) return head;     // If K is zero return head as no node needs to be reversed   
    Node* current = head;
    int count = 1;
    while (count < k && current != NULL) {  // while count is less than k traverse in linked list
        current = current->next;
        count++;
    }
    if (current == NULL) return head;       // If count exceeds size of linkedlist return head
    struct Node* kthNode = current;
    while (current->next != NULL) current = current->next;  // Take current node to last.
    current->next = head;                                   // Make current node next as head
    head = kthNode->next;                                   // Make head as kth node next
    kthNode->next = NULL;                                   // Mark kth node next as null
    return head;