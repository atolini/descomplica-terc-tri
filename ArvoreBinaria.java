public class ArvoreBinaria {
    private BIntNo Raiz;

    public ArvoreBinaria() {
        Raiz = null;
    }

    public void inserir(int novoValor) {
        Raiz = inserir(Raiz, novoValor);
    }

    private BIntNo inserir(BIntNo arvore, int novoNo) {
        if (arvore == null) {
            return new BIntNo(novoNo);
        } else {
            if (novoNo < arvore.valor) {
                arvore.esq = inserir(arvore.esq, novoNo);
            } else {
                arvore.dir = inserir(arvore.dir, novoNo);
            }
            return arvore;
        }
    }

    public void exibirNoEsq() {
        exibirEsquerdo(Raiz);
    }

    private void exibirEsquerdo(BIntNo arv) {
        if (arv != null) {
            exibirEsquerdo(arv.esq);
            System.out.print(arv.valor + " ");
        }
    }

    public void exibirNoDir() {
        exibirDireito(Raiz);
    }

    private void exibirDireito(BIntNo arv) {
        if (arv != null) {
            exibirDireito(arv.dir);
            System.out.print(arv.valor + " ");
        }
    }

    public void exibirRaiz() {
        if (Raiz != null) {
            System.out.println("Raiz: " + Raiz.valor);
        } else {
            System.out.println("Árvore vazia");
        }
    }

    public void remover(int item) {
        Raiz = removerNo(Raiz, item);
    }

    private BIntNo removerNo(BIntNo raiz, int item) {
        // Implemente a remoção aqui
        return raiz;
    }
}