package dev.andreijiroh.studentops.projects.dsaLabs;

/**
 * 03 Laboratory Exercise 2 - Data Strucutres and Algorithms
 * 
 * AI use disclosure: Gemini Flash (High) via Google Antigravity CLI was used for debugging
 * the undefined BSTNode() constructor error at L13 by simply declaring the root variable without
 * doing new BSTNode() part (which also creates a fresh node with key 0 and breaking future insertions).
 * See archive/genai-toolkit/agy-chat-export-202609251720.md in the repo root for details.
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/BST.java
 */
class BST {
  BSTNode root;

  public void insert(int key) {
    root = insertRec(root, key);
  }

  private BSTNode insertRec(BSTNode n, int k) {
    if (n == null) {
      return new BSTNode(k);
    };

    if (k < n.key) {
      n.left = insertRec(n.left, k);
    } else if (k > n.key) {
      n.right = insertRec(n.right, k);
    };

    return n;
  }

  public boolean search(BSTNode n, int k) {
    if (n == null) {
      return false;
    }

    if (n.key == k) {
      return true;
    }

    if (k < n.key) {
      return search(n.left, k);
    } else {
      return search(n.right, k);
    }
  }

  public void deleteKey(int key) {
    root = deleteRec(root, key);
  }

  private BSTNode deleteRec(BSTNode n, int k) {
    if (n == null) {
      return null;
    };

    if (k < n.key) {
      n.left = deleteRec(n.left, k);
    } else if (k > n.key) {
      n.right = deleteRec(n.right, k);
    } else {
      if (n.left == null) {
        return n.right;
      }

      if (n.right == null) {
        return n.left;
      }

      n.key = minValue(n.right);

      n.right = deleteRec(n.right, n.key);
    };

    return n;
  }


  private int minValue(BSTNode n) {
    while (n.left != null) {
      n = n.left;
    }

    return n.key;
  }

  public void inorderPrint() {
    inorder(root);
    System.out.println();
  }

  private void inorder(BSTNode n) {
    if (n != null) {
      inorder(n.left);
      System.out.print(n.key + " ");
      inorder(n.right);
    }
  }
}