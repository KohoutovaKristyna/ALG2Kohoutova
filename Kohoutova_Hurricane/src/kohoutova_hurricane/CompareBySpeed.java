/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohoutova_hurricane;

/**
 *
 * @author kristyna kohoutova
 */
public class CompareBySpeed implements ComparatorInterface{

    @Override
    public boolean bigger(Object o1, Object o2) {
        return ((Hurricane)o1).getSpeed()>((Hurricane)o2).getSpeed();
    }
    
}
