package br.calebe.ticketmachine.core;
import java.util.Iterator;

/**
 *
 * @author Vitória
 */
class TrocoIterator implements Iterator<PapelMoeda> {

        private Troco troco;
        private PapelMoeda current;
        private int indexCurrent;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
            indexCurrent = 0;
            current = troco.getPapeisMoeda().get(0);
        }

        public void first(){
            indexCurrent = 0;
            current = troco.getPapeisMoeda().get(0);           
        }
        
        @Override
        public boolean hasNext() {
            return troco.getPapeisMoeda().get(indexCurrent+1)!=null;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = troco.getPapeisMoeda().get(5);
            for (int i = 5; i >= 0 && ret != null; i--) {
                if (troco.getPapeisMoeda().get(i) != null) {
                    ret = troco.getPapeisMoeda().get(i);
                    troco.getPapeisMoeda().set(i, null);
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
