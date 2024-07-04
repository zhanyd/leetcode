#include <stdio.h>
#include <stdlib.h>

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
// 定义链表节点结构体
struct ListNode {
    int val;
    struct ListNode *next;
};

// 通过递归方式反转链表的函数
struct ListNode* reverseList(struct ListNode* head) {
    if(head == NULL || head->next == NULL) {
        return head;
    }
    struct ListNode* newHead = reverseList(head->next);
    head->next->next = head;
    head->next = NULL;
    return newHead;
}

// 打印链表的函数
void printList(struct ListNode* node) {
    while (node != NULL) {
        printf("%d ", node->val);
        node = node->next;
    }
    printf("\n");
}

// 创建一个新的链表节点
struct ListNode* createNode(int value) {
    struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
    newNode->val = value;
    newNode->next = NULL;
    return newNode;
}

// 构建一个链表用于测试
struct ListNode* buildList() {
    struct ListNode* head = createNode(1);
    head->next = createNode(2);
    head->next->next = createNode(3);
    return head;
}

int main() {
    // 构建测试链表
    struct ListNode* list = buildList();
    printf("Original list: ");
    printList(list);

    // 反转链表
    struct ListNode* reversedList = reverseList(list);
    printf("Reversed list: ");
    printList(reversedList);

    // 释放链表内存
    while (list != NULL) {
        struct ListNode* temp = list;
        list = list->next;
        free(temp);
    }

    return 0;
}