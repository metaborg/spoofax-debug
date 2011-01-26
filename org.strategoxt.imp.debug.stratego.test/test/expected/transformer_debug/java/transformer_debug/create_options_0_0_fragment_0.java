package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class create_options_0_0_fragment_0 extends Strategy 
{ 
  public static create_options_0_0_fragment_0 instance = new create_options_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_options_0_0_fragment_0");
    Fail281:
    { 
      IStrategoTerm term134 = term;
      Success132:
      { 
        Fail282:
        { 
          IStrategoTerm j_394 = null;
          IStrategoTerm k_394 = null;
          IStrategoTerm m_394 = null;
          IStrategoTerm n_394 = null;
          IStrategoTerm o_394 = null;
          m_394 = term;
          j_394 = transformer_debug.const67;
          n_394 = m_394;
          k_394 = transformer_debug.const122;
          o_394 = n_394;
          term = s_step_0_3.instance.invoke(context, o_394, j_394, k_394, transformer_debug.constLocationInfo29);
          if(term == null)
            break Fail282;
          term = $Option_3_0.instance.invoke(context, term, lifted84.instance, lifted85.instance, lifted86.instance);
          if(term == null)
            break Fail282;
          if(true)
            break Success132;
        }
        term = term134;
        IStrategoTerm term135 = term;
        Success133:
        { 
          Fail283:
          { 
            IStrategoTerm d_395 = null;
            IStrategoTerm e_395 = null;
            IStrategoTerm g_395 = null;
            IStrategoTerm j_395 = null;
            IStrategoTerm k_395 = null;
            g_395 = term;
            d_395 = transformer_debug.const67;
            j_395 = g_395;
            e_395 = transformer_debug.const122;
            k_395 = j_395;
            term = s_step_0_3.instance.invoke(context, k_395, d_395, e_395, transformer_debug.constLocationInfo33);
            if(term == null)
              break Fail283;
            term = $Arg$Option_3_0.instance.invoke(context, term, lifted87.instance, lifted88.instance, lifted89.instance);
            if(term == null)
              break Fail283;
            if(true)
              break Success133;
          }
          term = term135;
          IStrategoTerm term136 = term;
          Success134:
          { 
            Fail284:
            { 
              IStrategoTerm o_400 = null;
              IStrategoTerm p_400 = null;
              IStrategoTerm r_400 = null;
              IStrategoTerm s_400 = null;
              IStrategoTerm t_400 = null;
              IStrategoTerm v_400 = null;
              r_400 = term;
              o_400 = transformer_debug.const67;
              s_400 = r_400;
              p_400 = transformer_debug.const122;
              t_400 = s_400;
              term = s_step_0_3.instance.invoke(context, t_400, o_400, p_400, transformer_debug.constLocationInfo36);
              if(term == null)
                break Fail284;
              v_400 = term;
              term = $Option$Check_2_1.instance.invoke(context, v_400, lifted90.instance, lifted91.instance, transformer_debug.const137);
              if(term == null)
                break Fail284;
              if(true)
                break Success134;
            }
            term = term136;
            IStrategoTerm term137 = term;
            Success135:
            { 
              Fail285:
              { 
                IStrategoTerm k_401 = null;
                IStrategoTerm l_401 = null;
                IStrategoTerm n_401 = null;
                IStrategoTerm o_401 = null;
                IStrategoTerm p_401 = null;
                n_401 = term;
                k_401 = transformer_debug.const67;
                o_401 = n_401;
                l_401 = transformer_debug.const122;
                p_401 = o_401;
                term = s_step_0_3.instance.invoke(context, p_401, k_401, l_401, transformer_debug.constLocationInfo40);
                if(term == null)
                  break Fail285;
                term = $Arg$Option_3_0.instance.invoke(context, term, lifted93.instance, lifted94.instance, lifted95.instance);
                if(term == null)
                  break Fail285;
                if(true)
                  break Success135;
              }
              term = term137;
              IStrategoTerm term138 = term;
              Success136:
              { 
                Fail286:
                { 
                  IStrategoTerm m_402 = null;
                  IStrategoTerm n_402 = null;
                  IStrategoTerm q_402 = null;
                  IStrategoTerm r_402 = null;
                  IStrategoTerm s_402 = null;
                  IStrategoTerm u_402 = null;
                  q_402 = term;
                  m_402 = transformer_debug.const67;
                  r_402 = q_402;
                  n_402 = transformer_debug.const122;
                  s_402 = r_402;
                  term = s_step_0_3.instance.invoke(context, s_402, m_402, n_402, transformer_debug.constLocationInfo43);
                  if(term == null)
                    break Fail286;
                  u_402 = term;
                  term = $Option$Check_2_1.instance.invoke(context, u_402, lifted96.instance, lifted97.instance, transformer_debug.const146);
                  if(term == null)
                    break Fail286;
                  if(true)
                    break Success136;
                }
                term = term138;
                IStrategoTerm h_403 = null;
                IStrategoTerm i_403 = null;
                IStrategoTerm k_403 = null;
                IStrategoTerm l_403 = null;
                IStrategoTerm m_403 = null;
                k_403 = term;
                h_403 = transformer_debug.const67;
                l_403 = k_403;
                i_403 = transformer_debug.const122;
                m_403 = l_403;
                term = s_step_0_3.instance.invoke(context, m_403, h_403, i_403, transformer_debug.constLocationInfo48);
                if(term == null)
                  break Fail281;
                term = $Arg$Option_3_0.instance.invoke(context, term, lifted99.instance, lifted100.instance, lifted101.instance);
                if(term == null)
                  break Fail281;
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}