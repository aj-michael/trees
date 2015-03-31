import java.util.List;

public class TwoThreeTree_T {

  @Test
  public void testEmptyTree() {
    TwoThreeTree<Integer> tree = new TwoThreeTree<Integer>();
    assertFalse(tree.contains(0));
  }

  @Test
  public void testAddAll() {
    List<Integer> elems = Arrays.asList(3, 4, 6, 2, 1);
    TwoThreeTree<Integer> tree = new TwoThreeTree<Integer>();
    tree.addAll(elems);
    assertEqual(elems.size(), tree.size());
  }

}
