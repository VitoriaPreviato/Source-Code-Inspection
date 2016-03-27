package br.calebe.ticketmachine.core;
import java.util.Iterator;

/**
 *
 * @author Vitória
 */
class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 5; i >= 0; i--) {
                if (troco.getPapeisMoeda().get(i) != null) {
                    return true;
                }
            }
            return false;
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
