#include <stdio.h>
#include <stdlib.h>
typedef struct Node 
{
    int data;
    struct Node* left;
    struct Node* right;
} Node;
Node* createNode(int data)
{
    Node* newNode = (Node*)malloc(sizeof(Node));
    if (newNode == NULL) 
    {
        printf("Memory allocation failed\n");
        exit(1);
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}
Node* insert(Node* root, int data)
{
    if (root == NULL) 
    {
        return createNode(data);
    }
    if (data < root->data) {
        root->left = insert(root->left, data);
    } else {
        root->right = insert(root->right, data);
    }
    
    return root;
}
void inorderTraversal(Node* root)
{
    if (root != NULL)
    {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

int main() {
    Node* root = NULL;
    root = insert(root, 50);
    insert(root, 30);
    insert(root, 20);
    insert(root, 40);
    insert(root, 70);
    insert(root, 60);
    insert(root, 80);
    printf("Inorder traversal of the binary search tree:\n");
    inorderTraversal(root);
    printf("\n");
    return 0;
}
