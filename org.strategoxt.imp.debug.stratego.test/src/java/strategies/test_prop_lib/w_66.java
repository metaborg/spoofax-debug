package strategies.test_prop_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") final class w_66 extends Strategy 
{ 
  public static final w_66 instance = new w_66();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2:
    { 
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail3:
        { 
          IStrategoTerm term1 = term;
          IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success1:
          { 
            if(cons0 == test_prop._consNot_1)
            { 
              Fail4:
              { 
                IStrategoTerm arg0 = term.getSubterm(0);
                if(arg0.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg0).getConstructor())
                  break Fail4;
                term = test_prop_lib.constFalse0;
                if(true)
                  break Success1;
              }
              term = term1;
            }
            Success2:
            { 
              if(cons0 == test_prop._consNot_1)
              { 
                Fail5:
                { 
                  IStrategoTerm arg1 = term.getSubterm(0);
                  if(arg1.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg1).getConstructor())
                    break Fail5;
                  term = test_prop_lib.constTrue0;
                  if(true)
                    break Success2;
                }
                term = term1;
              }
              Success3:
              { 
                if(cons0 == test_prop._consAnd_2)
                { 
                  Fail6:
                  { 
                    IStrategoTerm g_66 = null;
                    IStrategoTerm arg2 = term.getSubterm(0);
                    if(arg2.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg2).getConstructor())
                      break Fail6;
                    g_66 = term.getSubterm(1);
                    term = g_66;
                    if(true)
                      break Success3;
                  }
                  term = term1;
                }
                Success4:
                { 
                  if(cons0 == test_prop._consAnd_2)
                  { 
                    Fail7:
                    { 
                      IStrategoTerm h_66 = null;
                      h_66 = term.getSubterm(0);
                      IStrategoTerm arg3 = term.getSubterm(1);
                      if(arg3.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg3).getConstructor())
                        break Fail7;
                      term = h_66;
                      if(true)
                        break Success4;
                    }
                    term = term1;
                  }
                  Success5:
                  { 
                    if(cons0 == test_prop._consAnd_2)
                    { 
                      Fail8:
                      { 
                        IStrategoTerm arg4 = term.getSubterm(0);
                        if(arg4.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg4).getConstructor())
                          break Fail8;
                        term = test_prop_lib.constFalse0;
                        if(true)
                          break Success5;
                      }
                      term = term1;
                    }
                    Success6:
                    { 
                      if(cons0 == test_prop._consAnd_2)
                      { 
                        Fail9:
                        { 
                          IStrategoTerm arg5 = term.getSubterm(1);
                          if(arg5.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg5).getConstructor())
                            break Fail9;
                          term = test_prop_lib.constFalse0;
                          if(true)
                            break Success6;
                        }
                        term = term1;
                      }
                      Success7:
                      { 
                        if(cons0 == test_prop._consOr_2)
                        { 
                          Fail10:
                          { 
                            IStrategoTerm arg6 = term.getSubterm(0);
                            if(arg6.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg6).getConstructor())
                              break Fail10;
                            term = test_prop_lib.constTrue0;
                            if(true)
                              break Success7;
                          }
                          term = term1;
                        }
                        Success8:
                        { 
                          if(cons0 == test_prop._consOr_2)
                          { 
                            Fail11:
                            { 
                              IStrategoTerm arg7 = term.getSubterm(1);
                              if(arg7.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg7).getConstructor())
                                break Fail11;
                              term = test_prop_lib.constTrue0;
                              if(true)
                                break Success8;
                            }
                            term = term1;
                          }
                          Success9:
                          { 
                            if(cons0 == test_prop._consOr_2)
                            { 
                              Fail12:
                              { 
                                IStrategoTerm m_66 = null;
                                IStrategoTerm arg8 = term.getSubterm(0);
                                if(arg8.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg8).getConstructor())
                                  break Fail12;
                                m_66 = term.getSubterm(1);
                                term = m_66;
                                if(true)
                                  break Success9;
                              }
                              term = term1;
                            }
                            Success10:
                            { 
                              if(cons0 == test_prop._consOr_2)
                              { 
                                Fail13:
                                { 
                                  IStrategoTerm n_66 = null;
                                  n_66 = term.getSubterm(0);
                                  IStrategoTerm arg9 = term.getSubterm(1);
                                  if(arg9.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg9).getConstructor())
                                    break Fail13;
                                  term = n_66;
                                  if(true)
                                    break Success10;
                                }
                                term = term1;
                              }
                              Success11:
                              { 
                                if(cons0 == test_prop._consImpl_2)
                                { 
                                  Fail14:
                                  { 
                                    IStrategoTerm o_66 = null;
                                    IStrategoTerm arg10 = term.getSubterm(0);
                                    if(arg10.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg10).getConstructor())
                                      break Fail14;
                                    o_66 = term.getSubterm(1);
                                    term = o_66;
                                    if(true)
                                      break Success11;
                                  }
                                  term = term1;
                                }
                                Success12:
                                { 
                                  if(cons0 == test_prop._consImpl_2)
                                  { 
                                    Fail15:
                                    { 
                                      IStrategoTerm arg11 = term.getSubterm(1);
                                      if(arg11.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg11).getConstructor())
                                        break Fail15;
                                      term = test_prop_lib.constTrue0;
                                      if(true)
                                        break Success12;
                                    }
                                    term = term1;
                                  }
                                  Success13:
                                  { 
                                    if(cons0 == test_prop._consImpl_2)
                                    { 
                                      Fail16:
                                      { 
                                        IStrategoTerm arg12 = term.getSubterm(0);
                                        if(arg12.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg12).getConstructor())
                                          break Fail16;
                                        term = test_prop_lib.constTrue0;
                                        if(true)
                                          break Success13;
                                      }
                                      term = term1;
                                    }
                                    Success14:
                                    { 
                                      if(cons0 == test_prop._consEq_2)
                                      { 
                                        Fail17:
                                        { 
                                          IStrategoTerm r_66 = null;
                                          IStrategoTerm arg13 = term.getSubterm(0);
                                          if(arg13.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg13).getConstructor())
                                            break Fail17;
                                          r_66 = term.getSubterm(1);
                                          term = termFactory.makeAppl(test_prop._consNot_1, new IStrategoTerm[]{r_66});
                                          term = this.invoke(context, term);
                                          if(term == null)
                                            break Fail17;
                                          if(true)
                                            break Success14;
                                        }
                                        term = term1;
                                      }
                                      Success15:
                                      { 
                                        if(cons0 == test_prop._consEq_2)
                                        { 
                                          Fail18:
                                          { 
                                            IStrategoTerm s_66 = null;
                                            s_66 = term.getSubterm(0);
                                            IStrategoTerm arg14 = term.getSubterm(1);
                                            if(arg14.getTermType() != IStrategoTerm.APPL || test_prop._consFalse_0 != ((IStrategoAppl)arg14).getConstructor())
                                              break Fail18;
                                            term = termFactory.makeAppl(test_prop._consNot_1, new IStrategoTerm[]{s_66});
                                            term = this.invoke(context, term);
                                            if(term == null)
                                              break Fail18;
                                            if(true)
                                              break Success15;
                                          }
                                          term = term1;
                                        }
                                        Success16:
                                        { 
                                          if(cons0 == test_prop._consEq_2)
                                          { 
                                            Fail19:
                                            { 
                                              IStrategoTerm t_66 = null;
                                              IStrategoTerm arg15 = term.getSubterm(0);
                                              if(arg15.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg15).getConstructor())
                                                break Fail19;
                                              t_66 = term.getSubterm(1);
                                              term = t_66;
                                              if(true)
                                                break Success16;
                                            }
                                            term = term1;
                                          }
                                          if(cons0 == test_prop._consEq_2)
                                          { 
                                            IStrategoTerm u_66 = null;
                                            u_66 = term.getSubterm(0);
                                            IStrategoTerm arg16 = term.getSubterm(1);
                                            if(arg16.getTermType() != IStrategoTerm.APPL || test_prop._consTrue_0 != ((IStrategoAppl)arg16).getConstructor())
                                              break Fail3;
                                            term = u_66;
                                          }
                                          else
                                          { 
                                            break Fail3;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if(true)
            break Success0;
        }
        term = term0;
      }
      if(true)
        return term;
    }
    return null;
  }
}