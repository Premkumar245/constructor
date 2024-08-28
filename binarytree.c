#include <stdio.h>
#include <stdlib.h>
typedef struct TreeNode 
{
    int value;               
    struct TreeNode* left;  
    struct TreeNode* right; 
} TreeNode;
int main() 
{
    TreeNode* root = (TreeNode*)malloc(sizeof(TreeNode));
    TreeNode* leftChild = (TreeNode*)malloc(sizeof(TreeNode));
    TreeNode* rightChild = (TreeNode*)malloc(sizeof(TreeNode));
    if (root == NULL || leftChild == NULL || rightChild == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }
    root->value = 1;
    root->left = leftChild;
    root->right = rightChild;
    leftChild->value = 2;
    leftChild->left = NULL;
    leftChild->right = NULL;
    rightChild->value = 3;
    rightChild->left = NULL;
    rightChild->right = NULL;
    printf("Root value: %d\n", root->value);
    printf("Left child value: %d\n", root->left->value);
    printf("Right child value: %d\n", root->right->value);
    free(root);
    free(leftChild);
    free(rightChild);
    return 0;
}
