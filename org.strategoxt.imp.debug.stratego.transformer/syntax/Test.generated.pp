[
   OverlayNoArgs                       -- _1 KW["="] _2,
   Overlay                             -- _1 KW["("] _2 KW[")"] KW["="] _3,
   Overlay.2:iter-star-sep             -- _1 KW[","],
   DynRuleScope                        -- KW["{|"] _1 KW[":"] _2 KW["|}"],
   ScopeLabels                         -- KW["~"] _1,
   GenDynRules                         -- KW["rules"] KW["("] _1 KW[")"],
   GenDynRules.1:iter-star             -- _1,
   AddScopeLabel                       -- _1 KW["+"] _2,
   UndefineDynRule                     -- _1 KW[":-"] _2,
   SetDynRule                          -- _1 KW[":"] _2,
   AddDynRule                          -- _1 KW[":+"] _2,
   SetDynRuleMatch                     -- _1 KW[":"] _2,
   DynRuleAssign                       -- _1 KW[":="] _2,
   DynRuleAssignAdd                    -- _1 KW[":+="] _2,
   SetDynRuleDepends                   -- _1 KW[":"] _2 KW["depends"] KW["on"] _3,
   LabeledDynRuleId                    -- _1 KW["."] _2,
   AddLabelDynRuleId                   -- _1 KW["+"] _2,
   DynRuleId                           -- _1,
   LabeledDynRuleScopeId               -- _1 KW["."] _2,
   DynRuleScopeId                      -- _1,
   RDecNoArgs                          -- _1,
   RDec                                -- _1 KW["("] _2 KW[")"],
   RDec.2:iter-star-sep                -- _1 KW[","],
   RDecT                               -- _1 KW["("] _2 KW["|"] _3 KW[")"],
   RDecT.2:iter-star-sep               -- _1 KW[","],
   RDecT.3:iter-star-sep               -- _1 KW[","],
   RuleNames                           -- KW["~"] _1,
   DynRuleIntersectFix                 -- KW["/"] _1 KW["\\*"] _2,
   DynRuleIntersect                    -- _1 KW["/"] _2 KW["\\"] _3,
   DynRuleUnion                        -- _1 KW["\\"] _2 KW["/"] _3,
   DynRuleIntersectUnion               -- _1 KW["/"] _2 KW["\\"] _3 KW["/"] _4,
   RDefNoArgs                          -- _1 KW[":"] _2,
   AnnoDef                             -- _1 _2,
   AnnoDef.1:iter                      -- _1,
   RDef                                -- _1 KW["("] _2 KW[")"] KW[":"] _3,
   RDef.2:iter-star-sep                -- _1 KW[","],
   RDefT                               -- _1 KW["("] _2 KW["|"] _3 KW[")"] KW[":"] _4,
   RDefT.2:iter-star-sep               -- _1 KW[","],
   RDefT.3:iter-star-sep               -- _1 KW[","],
   RuleNoCond                          -- _1 KW["->"] _2,
   Rule                                -- _1 KW["->"] _2 KW["where"] _3,
   Rule                                -- _1 KW["->"] _2 _3,
   Rule.3:iter                         -- _1,
   WhereClause                         -- KW["where"] _1,
   WithClause                          -- KW["with"] _1,
   SDefNoArgs                          -- _1 KW["="] _2,
   SDef                                -- _1 KW["("] _2 KW[")"] KW["="] _3,
   SDef.2:iter-star-sep                -- _1 KW[","],
   DefaultVarDec                       -- _1,
   Call                                -- _1 KW["("] _2 KW[")"],
   Call.2:iter-star-sep                -- _1 KW[","],
   ScopeDefault                        -- KW["{"] _1 KW["}"],
   BA                                  -- _1 _2,
   LChoice                             -- _1 KW["<+"] _2,
   Rec                                 -- KW["rec"] _1 KW["("] _2 KW[")"],
   Not                                 -- KW["not"] KW["("] _1 KW[")"],
   Where                               -- KW["where"] KW["("] _1 KW[")"],
   With                                -- KW["with"] KW["("] _1 KW[")"],
   Test                                -- KW["test"] KW["("] _1 KW[")"],
   PrimNoArgs                          -- KW["prim"] KW["("] _1 KW[")"],
   Prim                                -- KW["prim"] KW["("] _1 KW[","] _2 KW[")"],
   Prim.2:iter-star-sep                -- _1 KW[","],
   StrCong                             -- _1,
   IntCong                             -- _1,
   RealCong                            -- _1,
   CharCong                            -- _1,
   CongQ                               -- _1 KW["("] _2 KW[")"],
   CongQ.2:iter-star-sep               -- _1 KW[","],
   AnnoCong                            -- _1 _2,
   StrategyCurly                       -- KW["{"] _1 KW["}"],
   EmptyTupleCong                      -- KW["("] KW[")"],
   TupleCong                           -- KW["("] _1 KW[","] _2 KW[")"],
   TupleCong.2:iter-sep                -- _1 KW[","],
   ListCongNoTail                      -- KW["["] _1 KW["]"],
   ListCongNoTail.1:iter-star-sep      -- _1 KW[","],
   ListCong                            -- KW["["] _1 KW["|"] _2 KW["]"],
   ListCong.1:iter-star-sep            -- _1 KW[","],
   ExplodeCong                         -- _1 KW["#"] _2,
   CallNoArgs                          -- _1,
   LRule                               -- KW["\\"] _1 KW["\\"],
   SRule                               -- KW["("] _1 KW[")"],
   Choice                              -- _1 KW["+"] _2,
   RChoice                             -- _1 KW["+>"] _2,
   ProceedNoArgs                       -- KW["proceed"],
   Proceed                             -- KW["proceed"] KW["("] _1 KW[")"],
   Proceed.1:iter-sep                  -- _1 KW[","],
   CondChoice                          -- KW["if"] _1 KW["then"] _2 KW["else"] _3 KW["end"],
   IfThen                              -- KW["if"] _1 KW["then"] _2 KW["end"],
   SwitchChoiceNoOtherwise             -- KW["switch"] _1 _2 KW["end"],
   SwitchChoiceNoOtherwise.2:iter-star -- _1,
   SwitchChoice                        -- KW["switch"] _1 _2 KW["otherwise"] KW[":"] _3 KW["end"],
   SwitchChoice.2:iter-star            -- _1,
   SwitchCase                          -- KW["case"] _1 KW[":"] _2,
   AM                                  -- _1 KW["=>"] _2,
   Assign                              -- _1 KW[":="] _2,
   ListVar                             -- _1,
   Var                                 -- _1,
   BuildDefaultPT                      -- KW["_"] _1,
   BuildDefault                        -- KW["_"] _1,
   Char                                -- _1,
   AnnoList                            -- _1 KW["{"] _2 KW["}"],
   AnnoList.2:iter-star-sep            -- _1 KW[","],
   NoAnnoList                          -- _1,
   App                                 -- KW["<"] _1 KW[">"] _2,
   App                                 -- KW["<"] _1 KW[">"] _2,
   RootApp                             -- _1,
   RootApp                             -- _1,
   Tuple                               -- KW["("] _1 KW[")"],
   Tuple.1:iter-star-sep               -- _1 KW[","],
   List                                -- KW["["] _1 KW["]"],
   List.1:iter-star-sep                -- _1 KW[","],
   ListTail                            -- KW["["] _1 KW["|"] _2 KW["]"],
   ListTail.1:iter-star-sep            -- _1 KW[","],
   SortList                            -- KW["["] _1 KW["]"],
   SortList.1:iter-star-sep            -- _1 KW[","],
   SortListTl                          -- KW["["] _1 KW["|"] _2 KW["]"],
   SortListTl.1:iter-star-sep          -- _1 KW[","],
   SortTuple                           -- KW["("] _1 KW[")"],
   SortTuple.1:iter-star-sep           -- _1 KW[","],
   Star                                -- KW["*"],
   StarStar                            -- KW["**"],
   Sorts                               -- V  [H  [KW["sorts"]] _1],
   Sorts.1:iter-star                   -- _1,
   Constructors                        -- V  [H  [KW["constructors"]] _1],
   Constructors.1:iter-star            -- _1,
   SortVar                             -- _1,
   SortNoArgs                          -- _1,
   Sort                                -- _1 KW["("] _2 KW[")"],
   Sort.2:iter-star-sep                -- _1 KW[","],
   OpDecl                              -- _1 KW[":"] _2,
   OpDeclQ                             -- _1 KW[":"] _2,
   OpDeclInj                           -- KW[":"] _1,
   ExtOpDecl                           -- KW["external"] _1 KW[":"] _2,
   ExtOpDeclQ                          -- KW["external"] _1 KW[":"] _2,
   ExtOpDeclInj                        -- KW["external"] KW[":"] _1,
   ConstType                           -- _1,
   FunType                             -- _1 KW["->"] _2,
   FunType.1:iter-sep                  -- _1 KW["*"],
   Var                                 -- _1,
   Wld                                 -- KW["_"],
   Int                                 -- _1,
   Real                                -- _1,
   Str                                 -- _1,
   Op                                  -- _1 KW["("] _2 KW[")"],
   Op.2:iter-star-sep                  -- _1 KW[","],
   OpQ                                 -- _1 KW["("] _2 KW[")"],
   OpQ.2:iter-star-sep                 -- _1 KW[","],
   Explode                             -- _1 KW["#"] KW["("] _2 KW[")"],
   Anno                                -- _1 KW["{^"] _2 KW["}"],
   As                                  -- _1 KW["@"] _2,
   As                                  -- _1 KW["@"] _2,
   SVar                                -- _1,
   Let                                 -- KW["let"] _1 KW["in"] _2 KW["end"],
   Let.1:iter-star                     -- _1,
   CallT                               -- _1 KW["("] _2 KW["|"] _3 KW[")"],
   CallT.2:iter-star-sep               -- _1 KW[","],
   CallT.3:iter-star-sep               -- _1 KW[","],
   CallDynamic                         -- KW["call"] KW["("] _1 KW["|"] _2 KW["|"] _3 KW[")"],
   CallDynamic.2:iter-star-sep         -- _1 KW[","],
   CallDynamic.3:iter-star-sep         -- _1 KW[","],
   SDefT                               -- _1 KW["("] _2 KW["|"] _3 KW[")"] KW["="] _4,
   SDefT.2:iter-star-sep               -- _1 KW[","],
   SDefT.3:iter-star-sep               -- _1 KW[","],
   AnnoDef                             -- _1 _2,
   AnnoDef.1:iter                      -- _1,
   ExtSDefInl                          -- KW["external"] _1 KW["("] _2 KW["|"] _3 KW[")"] KW["="] _4,
   ExtSDefInl.2:iter-star-sep          -- _1 KW[","],
   ExtSDefInl.3:iter-star-sep          -- _1 KW[","],
   ExtSDef                             -- KW["external"] _1 KW["("] _2 KW["|"] _3 KW[")"],
   ExtSDef.2:iter-star-sep             -- _1 KW[","],
   ExtSDef.3:iter-star-sep             -- _1 KW[","],
   ExtSDef                             -- KW["external"] _1 KW["("] _2 KW["|"] _3 KW[")"],
   ExtSDef.2:iter-star-sep             -- _1 KW[","],
   ExtSDef.3:iter-star-sep             -- _1 KW[","],
   Extend                              -- KW["extend"],
   Override                            -- KW["override"],
   Internal                            -- KW["internal"],
   VarDec                              -- _1 KW[":"] _2,
   ParenStrat                          -- KW["("] _1 KW[")"],
   Fail                                -- KW["fail"],
   Id                                  -- KW["id"],
   ProceedT                            -- KW["proceed"] KW["("] _1 KW["|"] _2 KW[")"],
   ProceedT.1:iter-star-sep            -- _1 KW[","],
   ProceedT.2:iter-star-sep            -- _1 KW[","],
   ProceedNoArgs                       -- KW["proceed"],
   Match                               -- KW["?"] _1,
   Build                               -- KW["!"] _1,
   Scope                               -- KW["{"] _1 KW[":"] _2 KW["}"],
   Scope.1:iter-star-sep               -- _1 KW[","],
   Seq                                 -- _1 KW[";"] _2,
   GuardedLChoice                      -- _1 KW["<"] _2 KW["+"] _3,
   PrimT                               -- KW["prim"] KW["("] _1 KW[","] _2 KW["|"] _3 KW[")"],
   PrimT.2:iter-star-sep               -- _1 KW[","],
   PrimT.3:iter-star-sep               -- _1 KW[","],
   Some                                -- KW["some"] KW["("] _1 KW[")"],
   One                                 -- KW["one"] KW["("] _1 KW[")"],
   All                                 -- KW["all"] KW["("] _1 KW[")"],
   ImportTerm                          -- KW["import-term"] KW["("] _1 KW[")"],
   Module                              -- KW["module"] _1 _2,
   Module.2:iter-star                  -- _1,
   Specification                       -- V  [H  [KW["specification"]] _1],
   Specification.1:iter-star           -- _1,
   Imports                             -- V  [H  [KW["imports"]] _1],
   Imports.1:iter-star                 -- _1,
   Strategies                          -- V  [H  [KW["strategies"]] _1],
   Strategies.1:iter-star              -- _1,
   Signature                           -- V  [H  [KW["signature"]] _1],
   Signature.1:iter-star               -- _1,
   Import                              -- _1,
   Rules                               -- V  [H  [KW["rules"]] _1],
   Rules.1:iter-star                   -- _1,
   Overlays                            -- V  [H  [KW["overlays"]] _1],
   Overlays.1:iter-star                -- _1
]